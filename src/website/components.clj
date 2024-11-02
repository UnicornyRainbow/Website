(ns website.components
  (:require [hiccup.page :as page]))

(defn page-head
  [title permalink header-title description]
  [:head
   [:meta {:charset "UTF-8"}]
   [:meta {:http-equiv "content-type" :content "text/html; charset=utf-8"}]
   [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
   [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}] 
   [:title title]
   [:link {:rel "canonical" :href permalink}]
   [:meta {:property "og:url" :content permalink}]
   [:meta {:property "og:type" :content "website"}]
   [:meta {:property "og:title" :content header-title}]
   [:meta {:property "og:site_name" :content "UnicornyRainbow"}]
   [:meta {:property "og:description" :content description}]
   [:meta {:property "og:image" :content "/img/me.png"}]
   [:script {:type "application/ld+json"} (str
                                           "{\"@context\":\"https://schema.org\",\"@type\":\"WebSite\",\"description\":\""
                                           description
                                           "\",\"headline\":\"UnicornyRainbow\",\"name\":\""
                                           header-title
                                           "\",\"url\":\""
                                           permalink
                                           "\"}")]
   (when (= (System/getenv "ENVIRONMENT") "RELEASE")
    [:script {:defer "defer" :data-domain "unicornyrainbow.org" :src "https://plausible.unicornyrainbow.org/js/script.js"}])
   [:link {:rel "shortcut icon" :type "image/png" :href "/img/me.png?"}]
   (page/include-css "/css/style.css" "/css/header-style.css")])

(defn header [title subpages current-subpage]
  [:header
   [:div {:class "header-bar"}
    [:a {:href "/"}
     [:img {:class "logo" :src "/img/me.png" :alt "Unicorn's profile picture" :title "Home"}]]
    [:input {:type "checkbox" :class "nav-toggle" :id "nav-toggle"}]
    [:h1 title]
    [:nav
     [:ul
      (map (fn [subpage]
             [:li [:a
                   {:class (if (= subpage current-subpage)
                             "current"
                             "")
                    :href (str "/" subpage)}
                   subpage]])
           subpages)]]]])

(defn footer []
  [:footer
   [:hr]
   [:div {:class "grid auto-fill"}
    [:a {:href "/Privacy"} "Privacy / Datenschutzerklärung"]
    [:a {:href "/Licenses"} "Technology / Licenses"]
    [:a {:href "/Legal"} "Legal Info / Impressum"]]
   [:p
    "My profile picture is made with the "
    [:a {:class "external" :href "https://picrew.me/image_maker/626197/" :target "_blank"} "character maker"]
    " from hunbloom on "
    [:a {:class "external" :href "https://picrew.me/search/creator?crid=953491" :target "_blank"} "Picrew"]
    ". Check out their amazing art on "
    [:a {:class "external" :href "https://www.instagram.com/hunbloom/" :target "_blank"} "Instagram"]
    " and "
    [:a {:class "external" :href "https://twitter.com/hunblooms" :target "_blank"} "Twitter"]
    "."]
   [:p 
    "I try to make this website as accessible as possible, if you have some improvement suggestions, please "
    [:a {:class "external" :href "https://github.com/UnicornyRainbow/Website/issues/new" :target "_blank"} "open an issue on GitHub"]
    " or "
    [:a {:href "/Contact"} "contact me directly"]
    "."]])

(defn body 
  [title current-subpage permalink header-title description content]
  (page/html5
   (page-head title permalink header-title description)
   (header title ["Coding" "Photography" "Contact"] current-subpage)
   [:main content]
   (footer)
   [:script {:src "/js/instant.js" :type "module" :defer "defer"}]))

(defn portfolio-card
  [title url description image image-alt]
  [:a {:href url}
   [:div {:class "card card_image_radius_large"}
    [:img {:src image :loading "lazy" :alt image-alt}]
    [:div
     [:h3 title]
     [:p description]]]])

(defn legal-info []
  [:p
   [:bold (or (System/getenv "NAME")
              "some name")] [:br]
   (or (System/getenv "ADDRESS")
       "some street") [:br]
   (or (System/getenv "CITY")
       "some city") [:br]
   "Deutschland / Germany"])

(defn flatpak-setup-instructions []
  [:div
   [:h3 "Flatpak"]
   [:p "The package manager / packaging format used:"
    [:ul
     [:li
      "Fedora: "
      [:code "sudo dnf install flatpak"]]
     [:li
      "Ubuntu: "
      [:code "sudo apt install flatpak"]]
     [:li
      "Arch: "
      [:code "sudo pacman -S flatpak"]]]]
   [:p "Then add Flathub: "
    [:code "flatpak remote-add --if-not-exists flathub https://flathub.org/repo/flathub.flatpakrepo"]]
   [:p "Or follow the "
    [:a {:class "external"
         :href "https://www.flatpak.org/setup/"
         :target "_blank"}
     "official instructions"]]])
