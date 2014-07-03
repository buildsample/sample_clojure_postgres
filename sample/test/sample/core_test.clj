(ns sample.core-test
  (:require [clojure.test :refer :all]
            [sample.core :refer :all]))

(use 'clojure.tools.logging)

(deftest a-test
  (testing "Simple Postges query"
    (is (.contains (-main "lindsaybluth") "lindsay@bluth.com"))))
