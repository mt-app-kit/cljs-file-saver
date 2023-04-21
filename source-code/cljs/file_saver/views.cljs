
(ns file-saver.views)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn file-saver
  ; @ignore
  ;
  ; @param (map) saver-props
  ; {:data-url (string)(opt)
  ;  :filename (string)
  ;  :uri (string)(opt)}
  [{:keys [data-url filename uri] :or {filename "untitled.txt"}}]
  [:a (if data-url {:id :file-saver :download filename :href data-url}
                   {:id :file-saver :download filename :href uri})])
