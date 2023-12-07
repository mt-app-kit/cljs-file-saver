
(ns file-saver.api
    (:require [file-saver.side-effects :as side-effects]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (file-saver.side-effects)
(def save-file! side-effects/save-file!)
