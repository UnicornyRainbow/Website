(ns website.backend
  (:require [postal.core :as postal]))


(defn send-mail [subject email message]
  (println "test")
  (postal/send-message {:host (System/getenv "SMTP_HOST")
                        :user (System/getenv "SMTP_USER")
                        :pass (System/getenv "SMTP_PASS")
                        :ssl true}
                       {:from (System/getenv "SMTP_FROM")
                        :to (System/getenv "SMTP_TO")
                        :Reply-To email
                        :subject subject
                        :body [{:type "text/plain; charset=utf-8"
                                :content message}]}))
