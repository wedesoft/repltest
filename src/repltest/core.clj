(ns repltest.core
  "nREPL demo"
  (:gen-class))

(require '[nrepl.server :refer [start-server stop-server]])
(defonce server (start-server :port 7888))

(def t (atom 0))

(defn display
  [value]
  (println value))

(defn -main
  "nREPL demo"
  [& _args]
  (while true
         (display (swap! t inc))
         (Thread/sleep 1000))
  (System/exit 0))
