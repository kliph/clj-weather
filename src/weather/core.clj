(ns weather.core
  (:require [clojure.zip :as zip]
            [hickory.core :as hickory]
            [hickory.select :as s]
            [hickory.zip :as hz])
  (:gen-class))

(def weather-url "https://www.wunderground.com/DisplayDisc.asp?DiscussionCode=PHI&StateCode=PA&SafeCityName=Philadelphia")

(def selector #(s/select (s/class "column")
                         %))
(comment

  (-> (slurp weather-url)
      hickory/parse
      hickory/as-hickory
      selector)
  )


(defn -main [& args]
  (-> (slurp weather-url)
      hickory/parse
      selector
      println))
