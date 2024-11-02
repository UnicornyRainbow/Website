(ns website.pages
  (:require [website.components :as components]))

(defn not-found []
  (components/body
   "Not Found"
   ""
   "https://unicornyrainbow.org/"
   "UnicornyRainbow - Not Found"
   "Page not found"
   [:div
    [:h1 "Not Found"]
    [:b "The page you were navigating to was not found"]]))

(defn home []
  (components/body
   "UnicornyRainbow"
   ""
   "https://unicornyrainbow.org/"
   "UnicornyRainbow"
   "Unicorny's personal website"
   [:div {:class "grid auto-fit"}
    [:img {:src "/img/me.png" :style "width: 100%; border-radius: calc(var(--border-radius)*2);" :loading "lazy" :alt "Unicorn's profile picture. A small elf with shoulder length, brown hair, pointy ears, clip on cat ears, glasses, a choker and two pride pins with the nonbinary and pan flags."}]
    [:div
     [:p [:b "Hi"] ", I'm UnicornyRainbow or just Unicorn in short."]
     [:p "I'm a pan and genderqueer programmer and hobby photographer from Germany"]
     [:p "I mostly use they/them pronouns, but you can use whatever you want"]
     [:p "I am mostly programming / learning rust and python since about 2021 and taking pictures for far longer"]
     [:p
      "My profile picture is made with the "
      [:a {:class "external" :href "https://picrew.me/image_maker/626197/" :target "_blank"} "character maker"]
      " from hunbloom on "
      [:a {:class "external" :href "https://picrew.me/search/creator?crid=953491" :target "_blank"} "Picrew"]
      ". Check out their amazing art on "
      [:a {:class "external" :href "https://www.instagram.com/hunbloom/" :target "_blank"} "Instagram"]
      " and "
      [:a {:class "external" :href "https://twitter.com/hunblooms" :target "_blank"} "Twitter"]
      "."]]]))

(defn photography []
  (components/body
   "Photography"
   "Photography"
   "https://unicornyrainbow.org/Photography"
   "UnicornyRainbow - Photography"
   "Unicorny's photography projects"
   [:div
    [:h1 "Under Construction..."]])) ; TODO

(defn contact []
  (components/body
   "Contact"
   ""
   "https://unicornyrainbow.org/Contact"
   "UnicornyRainbow - Contact"
   "Contact Unicorny"
   [:div {:class "grid auto-fit"}
    [:img {:src "/img/me.png"
           :style "width: 100%; border-radius: calc(var(--border-radius)*2);"
           :loading "lazy"
           :alt "Unicorn's profile picture. A small elf with shoulder length, brown hair, pointy ears, clip on cat ears, glasses, a choker and two pride pins with the nonbinary and pan flags"}]
    [:div
     [:p "You can contact me under me using "
      [:a {:class "external" :href "mailto:contact@unicornyrainbow.org"} "mail"]]
     [:h1 "Contact form under construction"]]]))

(defn licenses []
  (components/body
   "Technology & Licenses"
   ""
   "https://unicornyrainbow.org/Licenses"
   "UnicornyRainbow - Licenses"
   "Licenses and used Technologies"
   [:div
    [:p "My profile picture is made with the "
     [:a {:class "external" :href "https://picrew.me/image_maker/626197/" :target "_blank"} "character maker"]
     " from hunbloom on "
     [:a {:class "external" :href "https://picrew.me/search/creator?crid=953491" :target "_blank"} "Picrew"]
     ". Check out their amazing art on "
     [:a {:class "external" :href "https://www.instagram.com/hunbloom/" :target "_blank"} "Instagram"]
     " and "
     [:a {:class "external" :href "https://twitter.com/hunblooms" :target "_blank"} "Twitter"]
     "." [:br]
     "I do not have any copyright or similar for this picture, all rights lie with the creator."]
    [:br]
    [:p "This website is build in clojure with ring, jetty, compojure and hiccup"]
    [:p "All of my code is licensed under the AGPL 3+ (GNU Affero General Public License) unless statet otherwise in the according repository (you can find the correct license in general in the according repository)."
     [:blockquote
      [:p "AGPL is a copyleft license for free and open source software (free as in freedom), meaning that you can use and modify the code in any way you want, as long as you license it under the same (or a compatible) license."]]]
    [:p "All my images are shared under a CC BY-SA license (Creative Commons Attribution Share-Alike) unless stated otherwise (you can find the correct license in general in the according Behance , meaning you can use and modify the image to your liking, as long as you license it under the same CC BY-SA  license and give credits to me."]
    [:br]
    [:p "This website uses the instant.page javascript snippet to preload links to make the site snappier." [:br]
     "instant.page is released under the MIT license"]
    [:br]
    [:p "This website uses Plausible analytics for privacy friendly analytics and tracking (find out more on the privacy page)." [:br]
     "Plausible is licensed in part under the AGPL and in part under the MIT licenses"]]))

(defn legal []
  (components/body
   "Legal Info / Impressum"
   ""
   "https://unicornyrainbow.org/Legal"
   "UnicornyRainbow - Legal Info"
   "Legal Info / Impressum"
   [:div
    (components/legal-info)
    [:p [:b "Kontakt / Contact"] [:br]
     "E-Mail "
     [:a {:class "external" :href "mailto:contact@unicornyrainbow.org"} "contact@unicornyrainbow.org"]]]))

(defn privacy-statement []
  (components/body
   "Privacy"
   ""
   "https://unicornyrainbow.org/Privacy"
   "UnicornyRainbow - Privacy"
   "Privacy / Datenschutzerklärung"
   [:div
    [:ul
     [:li [:a {:href "#deutsch"} "Deutsch / German"]]
     [:li [:a {:href "#english"} "English"]]]
    [:h1 {:id "deutsch"} "Deutsch"]
    [:h2 "Datenschutzerklärung"]
    [:div
     [:p "Personenbezogene Daten (nachfolgend zumeist nur „Daten“ genannt) werden von uns nur im Rahmen der Erforderlichkeit sowie zum Zwecke der Bereitstellung eines funktionsfähigen und nutzerfreundlichen Internetauftritts, inklusive seiner Inhalte und der dort angebotenen Leistungen, verarbeitet."]
     [:p "Gemäß Art. 4 Ziffer 1. der Verordnung (EU) 2016/679, also der Datenschutz-Grundverordnung (nachfolgend nur „DSGVO“ genannt), gilt als „Verarbeitung“ jeder mit oder ohne Hilfe automatisierter Verfahren ausgeführter Vorgang oder jede solche Vorgangsreihe im Zusammenhang mit personenbezogenen Daten, wie das Erheben, das Erfassen, die Organisation, das Ordnen, die Speicherung, die Anpassung oder Veränderung, das Auslesen, das Abfragen, die Verwendung, die Offenlegung durch Übermittlung, Verbreitung oder eine andere Form der Bereitstellung, den Abgleich oder die Verknüpfung, die Einschränkung, das Löschen oder die Vernichtung."]
     [:p "Mit der nachfolgenden Datenschutzerklärung informieren wir Sie insbesondere über Art, Umfang, Zweck, Dauer und Rechtsgrundlage der Verarbeitung personenbezogener Daten, soweit wir entweder allein oder gemeinsam mit anderen über die Zwecke und Mittel der Verarbeitung entscheiden. Zudem informieren wir Sie nachfolgend über die von uns zu Optimierungszwecken sowie zur Steigerung der Nutzungsqualität eingesetzten Fremdkomponenten, soweit hierdurch Dritte Daten in wiederum eigener Verantwortung verarbeiten."]
     [:p "Unsere Datenschutzerklärung ist wie folgt gegliedert:"
      [:ul
       [:li "I. Informationen über uns als Verantwortliche"]
       [:li "II. Rechte der Nutzer und Betroffenen"]
       [:li "III. Informationen zur Datenverarbeitung"]]]
     [:h3 "I. Informationen über uns als Verantwortliche"]
     [:div
      [:p "Verantwortlicher Anbieter dieses Internetauftritts im datenschutzrechtlichen Sinne ist:"]
      (components/legal-info)
      [:p "Datenschutzbeauftragte/r beim Anbieter ist:"]
      (components/legal-info)]
     [:h3 "II. Rechte der Nutzer und Betroffenen"]
     [:div
      [:p "Mit Blick auf die nachfolgend noch näher beschriebene Datenverarbeitung haben die Nutzer und Betroffenen das Recht"
       [:ul
        [:li "auf Bestätigung, ob sie betreffende Daten verarbeitet werden, auf Auskunft über die verarbeiteten Daten, auf weitere Informationen über die Datenverarbeitung sowie auf Kopien der Daten (vgl. auch Art. 15 DSGVO);"]
        [:li "auf Berichtigung oder Vervollständigung unrichtiger bzw. unvollständiger Daten (vgl. auch Art. 16 DSGVO);"]
        [:li "auf unverzügliche Löschung der sie betreffenden Daten (vgl. auch Art. 17 DSGVO), oder, alternativ, soweit eine weitere Verarbeitung gemäß Art. 17 Abs. 3 DSGVO erforderlich ist, auf Einschränkung der Verarbeitung nach Maßgabe von Art. 18 DSGVO;"]
        [:li "auf Erhalt der sie betreffenden und von ihnen bereitgestellten Daten und auf Übermittlung dieser Daten an andere Anbieter/Verantwortliche (vgl. auch Art. 20 DSGVO);"]
        [:li "auf Beschwerde gegenüber der Aufsichtsbehörde, sofern sie der Ansicht sind, dass die sie betreffenden Daten durch den Anbieter unter Verstoß gegen datenschutzrechtliche Bestimmungen verarbeitet werden (vgl. auch Art. 77 DSGVO)."]]]
      [:p "Darüber hinaus ist der Anbieter dazu verpflichtet, alle Empfänger, denen gegenüber Daten durch den Anbieter offengelegt worden sind, über jedwede Berichtigung oder Löschung von Daten oder die Einschränkung der Verarbeitung, die aufgrund der Artikel 16, 17 Abs. 1, 18 DSGVO erfolgt, zu unterrichten. Diese Verpflichtung besteht jedoch nicht, soweit diese Mitteilung unmöglich oder mit einem unverhältnismäßigen Aufwand verbunden ist. Unbeschadet dessen hat der Nutzer ein Recht auf Auskunft über diese Empfänger."]
      [:p [:b "Ebenfalls haben die Nutzer und Betroffenen nach Art. 21 DSGVO das Recht auf Widerspruch gegen die künftige Verarbeitung der sie betreffenden Daten, sofern die Daten durch den Anbieter nach Maßgabe von Art. 6 Abs. 1 lit. f) DSGVO verarbeitet werden. Insbesondere ist ein Widerspruch gegen die Datenverarbeitung zum Zwecke der Direktwerbung statthaft."]]]
     [:h3 "III. Informationen zur Datenverarbeitung"]
     [:p "Ihre bei Nutzung unseres Internetauftritts verarbeiteten Daten werden gelöscht oder gesperrt, sobald der Zweck der Speicherung entfällt, der Löschung der Daten keine gesetzlichen Aufbewahrungspflichten entgegenstehen und nachfolgend keine anderslautenden Angaben zu einzelnen Verarbeitungsverfahren gemacht werden."]
     [:h3 "Kontaktanfragen / Kontaktmöglichkeit"]
     [:div
      [:p "Sofern Sie per Kontaktformular oder E-Mail mit uns in Kontakt treten, werden die dabei von Ihnen angegebenen Daten zur Bearbeitung Ihrer Anfrage genutzt. Die Angabe der Daten ist zur Bearbeitung und Beantwortung Ihre Anfrage erforderlich - ohne deren Bereitstellung können wir Ihre Anfrage nicht oder allenfalls eingeschränkt beantworten."]
      [:p "Rechtsgrundlage für diese Verarbeitung ist Art. 6 Abs. 1 lit. b) DSGVO."]
      [:p "Ihre Daten werden gelöscht, sofern Ihre Anfrage abschließend beantwortet worden ist und der Löschung keine gesetzlichen Aufbewahrungspflichten entgegenstehen, wie bspw. bei einer sich etwaig anschließenden Vertragsabwicklung."]]
     [:h3 "Serverdaten"]
     [:div
      [:p "Aus technischen Gründen, insbesondere zur Gewährleistung eines sicheren und stabilen Internetauftritts, werden Daten durch Ihren Internet-Browser an uns bzw. an unseren Webspace-Provider übermittelt. Mit diesen sog. Server-Logfiles werden u.a. Typ und Version Ihres Internetbrowsers, das Betriebssystem, die Website, von der aus Sie auf unseren Internetauftritt gewechselt haben (Referrer URL), die Website(s) unseres Internetauftritts, die Sie besuchen, Datum und Uhrzeit des jeweiligen Zugriffs sowie die IP-Adresse des Internetanschlusses, von dem aus die Nutzung unseres Internetauftritts erfolgt, erhoben."]
      [:p "Diese so erhobenen Daten werden vorrübergehend gespeichert, dies jedoch nicht gemeinsam mit anderen Daten von Ihnen."]
      [:p "Diese Speicherung erfolgt auf der Rechtsgrundlage von Art. 6 Abs. 1 lit. f) DSGVO. Unser berechtigtes Interesse liegt in der Verbesserung, Stabilität, Funktionalität und Sicherheit unseres Internetauftritts."]
      [:p "Die Daten werden spätestens nach sieben Tage wieder gelöscht, soweit keine weitere Aufbewahrung zu Beweiszwecken erforderlich ist. Andernfalls sind die Daten bis zur endgültigen Klärung eines Vorfalls ganz oder teilweise von der Löschung ausgenommen."]]
     [:h3 "Allgemeine Verlinkung auf Profile bei Drittanbietern"]
     [:div
      [:p "Der Anbieter setzt auf der Website eine Verlinkung auf die nachstehend aufgeführten sozialen Netzwerke ein."]
      [:p "Rechtsgrundlage ist hierbei Art. 6 Abs. 1 lit. f DSGVO. Das berechtigte Interesse des Anbieters besteht an der Verbesserung der Nutzungsqualität der Website."]
      [:p "Die Einbindung der Plugins erfolgt dabei über eine verlinkte Grafik. Erst durch einen Klick auf die entsprechende Grafik wird der Nutzer zu dem Dienst des jeweiligen sozialen Netzwerks weitergeleitet."]
      [:p "Nach der Weiterleitung des Kunden werden durch das jeweilige Netzwerk Informationen über den Nutzer erfasst. Dies sind zunächst Daten wie IP-Adresse, Datum, Uhrzeit und besuchte Seite. Ist der Nutzer währenddessen in seinem Benutzerkonto des jeweiligen Netzwerks eingeloggt, kann der Netzwerk-Betreiber ggf. die gesammelten Informationen des konkreten Besuches des Nutzers dem persönlichen Account des Nutzers zuordnen. Interagiert der Nutzer über einen „Teilen“-Button des jeweiligen Netzwerks, können diese Informationen in dem persönlichen Benutzerkonto des Nutzers gespeichert und ggf. veröffentlicht werden. Will der Nutzer verhindern, dass die gesammelten Informationen unmittelbar seinem Benutzerkonto zugeordnet werden, muss sich der Nutzer vor dem Anklicken der Grafik ausloggen. Zudem besteht die Möglichkeit, das jeweilige Benutzerkonto entsprechend zu konfigurieren."]
      [:p "Folgende soziale Netzwerke sind vom Anbieter verlinkt:"
       [:ul
        [:li "Github.com:"
         [:p "GitHub Inc." [:br]
          "88 Colin P Kelly Jr St" [:br]
          "San Francisco, CA 94107" [:br]
          "USA"]
         [:p "Datenschutzerklärung: "
          [:a {:class "external"
               :href "https://docs.github.com/de/site-policy/privacy-policies/github-general-privacy-statement"
               :target "_blank"
               :rel "noopener nofollow"}
           "https://docs.github.com/de/site-policy/privacy-policies/github-general-privacy-statement"]]]
        [:li "Flathub.org:"
         [:p "Open Source Community Projekt"]
         [:p "Datenschutzerklärung: "
          [:a {:class "external"
               :href "https://flathub.org/privacy-policy"
               :target "_blank"
               :rel "noopener nofollow"}
           "https://flathub.org/privacy-policy"]]]]]
      [:h4 "Plausible"]
      [:div
       [:p "Zur erhebung anonymisierter Nutzungsstatistiken benutzen wir Plausible."]
       [:p "Plausible (Plausible.io) ist eine GDPR, CCPA und PECR konforme Analytics Software." [:br]
        "Daten werden über Plausible vollkommen anonymisiert und ohne den Einsatz von Cookies erhoben." [:br]
        "Alle erhobenen Daten werden ausschließlich von uns verarbeitet und nicht an Plausible.io weitergegeben." [:br]
        "Alle erhobenen Daten werden innerhalb Deutschlands gespeichert."]
       [:p "Es werden folgende Daten von Plausible erhoben:"
        [:ul
         [:li "Seiten URL"]
         [:li "HTTP Referer"]
         [:li "verwendeter Browser"]
         [:li "verwendetes Betriebssystem"]
         [:li "verwendeter Geräte Typ"]
         [:li "Standort (Land, Gegend und Stadt)"]]]
       [:p "Mehr Informationen können in der Data-Policy von Plausible gefunden werden: "
        [:a {:class "external"
             :href "https://plausible.io/data-policy"
             :target "_blank"}
         "https://plausible.io/data-policy"]
        "."]
       [:p "Plausible:"]
       [:p "Plausible Insights OÜ" [:br]
        "Västriku tn 2, 50403, Tartu, Estonia"]
       [:p "Vertreten durch: Uku Täht" [:br]
        "E-Mail: hello@plausible.io"]]]
     [:p
      [:a {:class "external"
           :href "https://www.generator-datenschutzerklärung.de"
           :target "_blank"
           :rel "noopener"}
       "Muster-Datenschutzerklärung"]
      " der "
      [:a {:class "external"
           :href "https://www.bewertung-löschen24.de"
           :rel "nofollow noopener"
           :target "_blank"}
       "Anwaltskanzlei Weiß &amp; Partner"]]]
    [:h1 {:id "english"} "English"]
    [:h2 "Privacy Policy"]
    [:div
     [:p "Personal data (usually referred to just as „data“ below) will only be processed by us to the extent necessary and for the purpose of providing a functional and user-friendly website, including its contents, and the services offered there."]
     [:p "Per Art. 4 No. 1 of Regulation (EU) 2016/679, i.e. the General Data Protection Regulation (hereinafter referred to as the „GDPR“), „processing“ refers to any operation or set of operations such as collection, recording, organization, structuring, storage, adaptation, alteration, retrieval, consultation, use, disclosure by transmission, dissemination, or otherwise making available, alignment, or combination, restriction, erasure, or destruction performed on personal data, whether by automated means or not."]
     [:p "The following privacy policy is intended to inform you in particular about the type, scope, purpose, duration, and legal basis for the processing of such data either under our own control or in conjunction with others. We also inform you below about the third-party components we use to optimize our website and improve the user experience which may result in said third parties also processing data they collect and control."]
     [:p "Our privacy policy is structured as follows:"
      [:ul
       [:li "I. Information about us as controllers of your data"]
       [:li "II. The rights of users and data subjects"]
       [:li "III. Information about the data processing"]]]
     [:h3 "I. Information about us as controllers of your data"]
     [:div
      [:p "The party responsible for this website (the „controller“) for purposes of data protection law is:"]
      (components/legal-info)
      [:p "The controller`s data protection officer is:"]
      (components/legal-info)]
     [:h3 "II. The rights of users and data subjects"]
     [:div
      [:p "With regard to the data processing to be described in more detail below, users and data subjects have the right"
       [:ul
        [:li "to confirmation of whether data concerning them is being processed, information about the data being processed, further information about the nature of the data processing, and copies of the data (cf. also Art. 15 GDPR);"]
        [:li "to correct or complete incorrect or incomplete data (cf. also Art. 16 GDPR);"]
        [:li "to the immediate deletion of data concerning them (cf. also Art. 17 DSGVO), or, alternatively, if further processing is necessary as stipulated in Art. 17 Para. 3 GDPR, to restrict said processing per Art. 18 GDPR;"]
        [:li "to receive copies of the data concerning them and/or provided by them and to have the same transmitted to other providers/controllers (cf. also Art. 20 GDPR);"]
        [:li "to file complaints with the supervisory authority if they believe that data concerning them is being processed by the controller in breach of data protection provisions (see also Art. 77 GDPR)."]]]
      [:p "In addition, the controller is obliged to inform all recipients to whom it discloses data of any such corrections, deletions, or restrictions placed on processing the same per Art. 16, 17 Para. 1, 18 GDPR. However, this obligation does not apply if such notification is impossible or involves a disproportionate effort. Nevertheless, users have a right to information about these recipients."]
      [:p [:b "Likewise, under Art. 21 GDPR, users and data subjects have the right to object to the controller’s future processing of their data pursuant to Art. 6 Para. 1 lit. f) GDPR. In particular, an objection to data processing for the purpose of direct advertising is permissible."]]]
     [:h3 "III. Information about the data processing"]
     [:div
      [:p "Your data processed when using our website will be deleted or blocked as soon as the purpose for its storage ceases to apply, provided the deletion of the same is not in breach of any statutory storage obligations or unless otherwise stipulated below."]
      [:h4 "Contact"]
      [:div
       [:p "If you contact us via email or the contact form, the data you provide will be used for the purpose of processing your request. We must have this data in order to process and answer your inquiry; otherwise we will not be able to answer it in full or at all."]
       [:p "The legal basis for this data processing is Art. 6 Para. 1 lit. b) GDPR."]
       [:p "Your data will be deleted once we have fully answered your inquiry and there is no further legal obligation to store your data, such as if an order or contract resulted therefrom."]]
      [:h4 "Server data"]
      [:div
       [:p "For technical reasons, the following data sent by your internet browser to us or to our server provider will be collected, especially to ensure a secure and stable website: These server log files record the type and version of your browser, operating system, the website from which you came (referrer URL), the webpages on our site visited, the date and time of your visit, as well as the IP address from which you visited our site."]
       [:p "The data thus collected will be temporarily stored, but not in association with any other of your data."]
       [:p "The basis for this storage is Art. 6 Para. 1 lit. f) GDPR. Our legitimate interest lies in the improvement, stability, functionality, and security of our website."]
       [:p "The data will be deleted within no more than seven days, unless continued storage is required for evidentiary purposes. In which case, all or part of the data will be excluded from deletion until the investigation of the relevant incident is finally resolved."]]
      [:h4 "General introduction"]
      [:div
       [:p "General linking to third-party profiles"]
       [:p "The provider includes a link on the website to the social media listed below."]
       [:p "The legal basis for this is Article 6 para. 1 lit. f GDPR. The legitimate interest of the provider is to improve the quality of use of the website."]
       [:p "The plugins are integrated via a linked graphic. The user is only forwarded to the service of the respective social media by clicking on the corresponding graphic."]
       [:p "After the customer has been forwarded, information about the user is recorded by the respective social media. This is initially data such as IP address, date, time and page visited. If the user is logged into his/her user account of the respective social media at the same time, the social media operator can, if required, assign the information collected from the user’s specific visit to the user’s personal account. If the user interacts via a “Share” button of the respective social media, this information can be stored in the user’s personal user account and, if required, be published. If the user wants to prevent the collected information from being directly assigned to his/her user account, the user must log out before clicking on the graphic. It is also possible to configure the respective user account accordingly."]
       [:p "The following social media are linked by the provider:"
        [:ul
         [:li "Github.com:"
          [:p "GitHub Inc." [:br]
           "88 Colin P Kelly Jr St" [:br]
           "San Francisco, CA 94107" [:br]
           "USA"]
          [:p "Datenschutzerklärung: "
           [:a {:class "external"
                :href "https://docs.github.com/en/site-policy/privacy-policies/github-general-privacy-statement"
                :target "_blank"
                :rel "noopener nofollow"}
            "https://docs.github.com/en/site-policy/privacy-policies/github-general-privacy-statement"]]]
         [:li "Flathub.org:"
          [:p "Open Source Community Projekt"]
          [:p "Privacy Policy: "
           [:a {:class "external"
                :href "https://flathub.org/privacy-policy"
                :target "_blank"
                :rel "noopener nofollow"}
            "https://flathub.org/privacy-policy"]]]]]]
      [:h4 "Plausible"]
      [:div
       [:p "We use Plausible to collect anonymized user statistics"]
       [:p "Plausible (Plausible.io) is a GDPR, CCPA and PECR compliant software." [:br]
        "Data collected using Plausible are completely anonymized and collected without the use of cookies." [:br]
        "All collected data is processed only by us and is not forwarded or made available to Plausible.io." [:br]
        "All collected data is stored in Germany."]
       [:p "The following data is collected using Plausible:"
        [:ul
         [:li "Page URL"]
         [:li "HTTP Referer"]
         [:li "used Browser"]
         [:li "used operating system"]
         [:li "used device type"]
         [:li "location (country, area and city)"]]]
       [:p "More information can be found in the data policy from Plausible: "
        [:a {:class "external"
             :href "https://plausible.io/data-policy"
             :target "_blank"}
         "https://plausible.io/data-policy"]
        "."]
       [:p "Plausible:"]
       [:p "Plausible Insights OÜ" [:br]
        "Västriku tn 2, 50403, Tartu, Estonia"]
       [:p "Represented by: Uku Täht" [:br]
        "E-Mail: hello@plausible.io"]]]
     [:p
      [:a {:class "external"
           :href "https://www.generator-datenschutzerklärung.de"
           :target "_blank"
           :rel "noopener"}
       "Model Data Protection Statement"]
      " for "
      [:a {:class "external"
           :href "https://www.bewertung-löschen24.de"
           :rel "nofollow noopener"
           :target "_blank"}
       "Anwaltskanzlei Weiß &amp; Partner"]]]]))
