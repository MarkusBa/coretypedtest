(ns fire.main
  (:require [clojure.tools.cli :refer [cli]]
            [clojure.core.typed :refer [ann check-ns print-env letfn> typed-deps
                                        ann-protocol loop> def-alias dotimes> ann-form
                                        Atom1 fn>] :as t]
            [clojure.core.typed.hole :refer [silent-hole]]
            [clojure.tools.analyzer.hygienic :as hy]
            [clojure.java.io :refer [reader]]
            [clojure.string :as str])
  (:import (clojure.lang Seqable))
  (:gen-class))

(ann handle-number [(U nil Number) -> Number])
(defn handle-number [a]
  (+ a 20))
