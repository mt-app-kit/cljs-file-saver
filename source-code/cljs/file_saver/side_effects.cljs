
(ns file-saver.side-effects
    (:require [dom.api              :as dom]
              [file-saver.views     :as views]
              [hidden-container.api :as hidden-container]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn save-file!
  ; @description
  ; Saves the given data URL or the given URI as a file to the client device.
  ;
  ; @param (map) options
  ; {:data-url (string)(opt)
  ;  :filename (string)(opt)
  ;   Default: "untitled.txt"
  ;  :uri (string)(opt)}
  ;
  ; @usage
  ; (save-file! {:data-url "data:text/plain;charset=utf-8,..."}
  ;              :filename "my-file.edn"})
  ;
  ; @usage
  ; (save-file! {:uri      "/images/my-image.jpg"}
  ;              :filename "my-image.jpg"})
  [options]
  (letfn [(f0 [] (-> "file-saver" dom/get-element-by-id .click))]
         (hidden-container/append-component! :file-saver [views/file-saver options] {:auto-remove? true :callback-f f0 :lifetime 500})))
