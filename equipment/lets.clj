(ns lets
  (:require
   [clojure.string :as str]
   [clojure.tools.build.api :as b])
  (:import
   [java.io File]))

(defonce deps-basis (delay (b/create-basis {:project "deps.edn"})))

(defn clr [& _]
  (println "running clojure-clr pseudo deps.edn project")
  (let [LOAD_PATH (str/join File/pathSeparator (keys (:classpath @deps-basis)))
        cmds      ["Clojure.Main.exe" "-m" "matsu.core"]]
    (b/process {:env {"CLOJURE_LOAD_PATH" LOAD_PATH}
                :command-args cmds})))
