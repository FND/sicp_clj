(defn a-plus-abs-b [a b]
    ((if (> b 0) + -) a b))

(prn (a-plus-abs-b -1 -1))
(prn (a-plus-abs-b -1 0))
(prn (a-plus-abs-b -1 1))
(prn (a-plus-abs-b -1 -1))
(prn (a-plus-abs-b 0 -1))
(prn (a-plus-abs-b 1 -1))
