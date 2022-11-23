(defproject com.github.igrishaev/zippo "0.1.2"

  :description
  "Additions to the standard clojure.zip package."

  :url
  "https://github.com/igrishaev/zippo"

  :license
  {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
   :url "https://www.eclipse.org/legal/epl-2.0/"}

  :deploy-repositories
  {"releases" {:url "https://repo.clojars.org" :creds :gpg}}

  :release-tasks
  [["vcs" "assert-committed"]
   ["test"]
   ["change" "version" "leiningen.release/bump-version" "release"]
   ["vcs" "commit"]
   ["vcs" "tag" "--no-sign"]
   ["deploy"]
   ["change" "version" "leiningen.release/bump-version"]
   ["vcs" "commit"]
   ["vcs" "push"]]

  :dependencies
  []

  :profiles
  {:dev
   {:dependencies
    [[org.clojure/clojure "1.10.1"]]

    :global-vars
    {*warn-on-reflection* true
     *assert* true}}})
