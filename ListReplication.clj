(fn [num lst]
    (loop [head (first lst) tail (rest lst)]
        (if-not (nil? head)
            (do
                (dotimes [i num] (println head))
                (recur (first tail) (rest tail))))))

                
