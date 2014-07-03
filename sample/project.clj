(defproject sample "0.1.0-SNAPSHOT"
  :description "Clojure Sample App with PostgreSQL"
  :url "http://github.com/Shippable/sample_clojure_postgres"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
  				[org.clojure/java.jdbc "0.3.2"]
  				[postgresql "9.1-901.jdbc4"]
  				[org.clojure/tools.logging "0.2.3"]]
  :main ^:skip-aot sample.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
