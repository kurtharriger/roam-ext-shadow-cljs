(ns app.views
  (:require [reagent.core :as r]
            [app.state :refer [state]]
            [app.events :refer [update-greetee]]))

(defn greetee-form []
  [:input {:onChange update-greetee
           :placeholder "Enter someone to greet"}])

(defn greeter [greetee]
  [:div.greeter (apply str "Hello " greetee "!")])

(defn app []
  [:div.app.container
   [:h1 "Reagent/ShadowCLJS Starter"]
   (greetee-form)
   (greeter (@state :greetee))])
