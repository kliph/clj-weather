(defproject weather "0.1.0-SNAPSHOT"
  :description "Scrape Weather Underground's Nifty Scientific Forecaster Discussion in Clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [org.clojure/tools.cli "0.3.5"]]
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[lein-binplus "0.6.2"]]}}
  :bin {:name "weather"}
  :main weather.core)
