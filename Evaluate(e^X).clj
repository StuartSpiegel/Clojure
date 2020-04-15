
(defn factorial [n]
    (reduce * (range 1 (inc n))))

    (defn exp [x n]
        (reduce * (repeat n x)))

    (let
    [in (clojure.string/split (slurp *in*) #"\s")
    tests (read-string (first in))
    input-data (rest in)]
    (loop [input-data input-data]
        (when (not-empty input-data)
            (println
                (reduce +
                    (map
                        (fn [l r]
                            (/
                                (reduce * (repeat r l))
                                (reduce * (range 1 (inc r)))))
                        (repeat 10 (read-string (first input-data)))
                        (iterate inc 0))))
            (recur (rest input-data)))))
