; website
;     Copyright (C) 2024  UnicornyRainbow
;
;     This program is free software: you can redistribute it and/or modify
;     it under the terms of the GNU Affero General Public License as published by
;     the Free Software Foundation, either version 3 of the License, or
;     (at your option) any later version.
;
;     This program is distributed in the hope that it will be useful,
;     but WITHOUT ANY WARRANTY; without even the implied warranty of
;     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;     GNU Affero General Public License for more details.
;
;     You should have received a copy of the GNU Affero General Public License
;     along with this program.  If not, see <https://www.gnu.org/licenses/agpl.html>.
(defproject website "0.1.0"
  :description "Unicorns Website"
  :url "http://unicornyrainbow.org"
  :license {:name "AGPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.gnu.org/licenses/agpl.html"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring/ring-core "1.9.6"]
                 [ring/ring-jetty-adapter "1.9.6"]
                 [ring/ring-defaults "0.3.4"]
                 [compojure/compojure "1.7.0"]
                 [hiccup/hiccup "1.0.5"]]
  :main ^:skip-aot website.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]
                       :uberjar-name "website.jar"}})
