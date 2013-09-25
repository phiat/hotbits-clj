(ns hotbits.core-test
  (:require [clojure.test :refer :all]
            [hotbits.core :refer :all]))

(deftest hotbits-count
  (testing "hotbits-count-512"
    (is (= (count (hotbits)) 512))))
