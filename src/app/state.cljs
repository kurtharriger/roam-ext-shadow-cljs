(ns app.state
  (:require [reagent.core :as r]))

(defonce state (r/atom {:greetee ""}))