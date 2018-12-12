(ns app.core
  (:require [reagent.core :as r]
            [app.views :refer [app]]))

(defn ^:dev/after-load start []
  (js/console.log "Starting...")
  (r/render [app]
            (.getElementById js/document "root")))

(defn ^:export main []
  (start))