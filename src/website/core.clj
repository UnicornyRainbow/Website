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

(ns website.core
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [ring.adapter.jetty :as jetty]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [website.pages :as pages]
            [website.coding-pages :as coding-pages])
  (:gen-class))

(defroutes app-routes
  (GET "/" []
    (pages/home))
  (GET "/Contact" []
    (pages/contact))
  (GET "/Licenses" []
    (pages/licenses))
  (GET "/Legal" []
    (pages/legal))
  (GET "/Privacy" []
    (pages/privacy-statement))
  (GET "/Photography" []
    (pages/photography))
  (GET "/Coding" []
    (coding-pages/coding))
  (GET "/Coding/Codey" []
    (coding-pages/codey))
  (GET "/Coding/KeyCutter" []
    (coding-pages/key-kutter))
  (GET "/Coding/Organizer" []
    (coding-pages/organizer))
  (route/resources "/")
  (route/not-found
   (pages/not-found)))

(def app
  (wrap-defaults #'app-routes site-defaults))

(defn -main []
  (let [port (parse-long (or (System/getenv "PORT")
                             "8000"))]
    (jetty/run-jetty #'app {:port port})))

(comment
  ;; evaluate this def form to start the webapp via the REPL:
  ;; :join? false runs the web server in the background!
  (def server
    (jetty/run-jetty
     #'app
     {:port 8000 :join? false}))
  ;; evaluate this form to stop the webapp via the the REPL:
  (.stop server))
