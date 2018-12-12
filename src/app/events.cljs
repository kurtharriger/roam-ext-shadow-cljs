(ns app.events
  (:require [app.state :refer [state]]))

(defn update-greetee [event]
  (let [name (-> event .-target .-value)]
    (.preventDefault event)
    (swap! state assoc :greetee name)))