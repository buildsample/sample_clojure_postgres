(ns sample.core
  (:gen-class))

(use 'clojure.tools.logging)
(load-file "db/repl-connection.clj")

(defn -main
	[username]
	(jdbc/execute! pgdb [create-users-table-sql])
	(jdbc/insert! pgdb :users {:username "lindsaybluth" :email "lindsay@bluth.com"})
	(jdbc/insert! pgdb :users {:username "tobiasfunke" :email "tobias@funke.com"})
	(apply str (jdbc/query pgdb ["select * from users where username=?" username])))
