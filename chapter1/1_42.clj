(defn inc [x] (+ x 1))
(defn square [x] (* x x))

(defn compose [f g]
    (fn [x] (f (g x))))

(prn ((compose square inc) 6))
(prn (-> 6 inc square))
