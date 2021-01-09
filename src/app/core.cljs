(ns app.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [app.views :refer [app]]))


(defn ^:dev/after-load start []
      (js/console.log "Starting...")
      (rdom/render [app]
                   (.querySelector js/document "[data-link-title='cljs-root']")
                   #_(.getElementById js/document "root"))
      )

(defn ^:export observe []
      (let [callback (fn [mutations] (prn mutations))
            observer (js/MutationObserver. callback)]
           (.observe observer
                     (.-body js/document)
                     #js {:childList true :subtree true})))

(defn ^:export main []
    (start))
