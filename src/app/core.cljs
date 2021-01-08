(ns app.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [app.views :refer [app]]))


(defn ^:dev/after-load start []
  (js/console.log "Starting...")
  (rdom/render [app]
            (.getElementById js/document "root")))


(defn ^:export main []
  (start))
