(ns rewrite-clj.node.integer-test
  (:require [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check.properties :as prop #?@(:cljs [:include-macros true])]
            [rewrite-clj.node :as node]
            [rewrite-clj.node.generators :as g]))

(defspec t-all-integer-nodes-produce-readable-strings 100
  (prop/for-all [node g/integer-node]
                (read-string (node/string node))))
