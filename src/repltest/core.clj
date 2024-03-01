(ns repltest.core
  "nREPl demo"
  (:gen-class))

(require '[nrepl.server :refer [start-server stop-server]])
(defonce server (start-server :port 7888))

(def t (atom 0))

(defn -main
  "nREPL demo"
  [& _args]
  (while true
         (println (swap! t inc))
         (Thread/sleep 1000))
  (System/exit 0))
