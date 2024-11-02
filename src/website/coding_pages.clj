(ns website.coding-pages
  (:require [website.components :as components]))

(defn coding []
  (components/body
   "Coding"
   "Coding"
   "https://unicornyrainbow.org/Coding"
   "UnicornyRainbow - Coding"
   "Unicorny's coding projects"
   [:div
    [:div {:class "grid auto-fill"}
     (components/portfolio-card
      "Key Cutter"
      "/Coding/KeyCutter"
      "Easily generate passwords"
      "/img/coding/key_cutter/logo.png"
      "Red circle with a golden key on top")
     (components/portfolio-card
      "Organizer"
      "/Coding/Organizer"
      "A Simple Kanban Board - in development"
      "/img/coding/organizer/logo.png"
      "A stylized kanban board with a white background, light grey elements and pastel colored details")
     (components/portfolio-card
      "Codey"
      "/Coding/Codey"
      "A simple application to preview and run code files for web development"
      "/img/coding/codey/logo.png"
      "Dark grey circle with the symbols < c / > on top, the < and > are light grey, the c is red and the / is neon green")]]))

(defn codey []
  (components/body
   "Codey"
   "Coding"
   "https://unicornyrainbow.org/Coding/Codey"
   "UnicornyRainbow - Codey"
   "Codey - A simple application to preview and run code files for web development"
   [:div
    [:div {:class "grid auto-fit"}
     [:img {:src "/img/coding/codey/app_dark.png"
            :style "width: 100%;"
            :alt "The application window using GTK and Libadwaita UI components ind dark mode. The window shows controls and a file selector on the left side and some source code on the right side."}]
     [:div
      [:p "A simple application to preview and run code files, primarily intended for webdevelopment." [:br]
       "Codey is written in python, using Gtk4 and Libadwaita and supports automatic light and dark mode." [:br]
       "It also supports automatically starting and stopping the MariaDB database, but this feature prompts the user everytime the database is started or stopped for the root password." [:br]
       "It is based on Python and uses the build in Php webserver."]
      [:p "Get the source code on "
       [:a {:class "external"
            :href "https://github.com/UnicornyRainbow/Codey"
            :target "_blank"}
        "Github"]]]]
    [:h2 "Installation"]
    [:details
     [:summary "Dependencies"]
     (components/flatpak-setup-instructions)
     [:div
      [:h3 "php"]
      [:p "PHP should already be installed, if not:"
       [:ul
        [:li "Fedora: "
         [:code "sudo dnf install php"]]
        [:li "Ubuntu: "
         [:code "sudo apt install php"]]
        [:li "Arch"
         [:code "sudo pacman -S php"]]]]]
     [:div
      [:h3 "MariaDB (optionally)"]
      [:p "You only need MariaDB, if you want to use the MariaDB feature of Codey."
       [:ul
        [:li "Fedora: "
         [:code "sudo dnf install mariadb-server"]]
        [:li "Ubuntu: "
         [:code "sudo apt install mariadb-server"]]
        [:li "Arch"
         [:code "sudo pacman -S mariadb"]]]]]]
    [:details
     [:summary "Installation"]
     [:h3 "Graphical"]
     [:p "Go to the "
      [:a {:class "external"
           :href "https://github.com/UnicornyRainbow/Codey/releases/latest"
           :target "_blank"}
       "latest release"]
      " and download the correct file for your cpu architecture (if you are not sure, give codey.flatpak a try)." [:br]
      "Then open the file in your file manager and double click it, it should open your graphical package manager /software store, then click on install."]
     [:h3 "Command Line"]
     [:p
      "Download it with"
      [:ul
       [:li
        [:code "wget https://github.com/UnicornyRainbow/Codey/releases/latest/download/codey.flatpak"]
        " for x86"]
       [:li
        [:code "wget https://github.com/UnicornyRainbow/Codey/releases/latest/download/codey_aarch.flatpak"]
        " for aarch"]]
      "then install it"
      [:ul
       [:li
        [:code "sudo flatpak install codey.flatpak"]
        " or"]
       [:li [:code "sudo flatpak install codey_aarch.flatpak"]]]]]]))

(defn key-kutter []
  (components/body
   "KeyCutter"
   "Coding"
   "https://unicornyrainbow.org/Coding/KeyCutter"
   "UnicornyRainbow - KeyCutter"
   "KeyCutter - Easily generate passwords"
   [:div
    [:div {:class "grid auto-fit"}
     [:img {:src "/img/coding/key_cutter/app_dark.png"
            :style "width: 100%;"
            :alt "The application window using GTK and Libadwaita UI components ind dark mode. The window is small and vertical and shows the default view of the app with settings that can be set, a password output field and a generate button."}]
     [:div
      [:p "A small app written in Python, Gtk4 and Libadwaita that can generate passwords." [:br]
       "It uses "
       [:a {:class "external"
            :href "https://docs.python.org/3/library/secrets.html"
            :target "_blank"}
        "Pythons Secrets module"]
       " to generate the passwords, so they should be decently secure." [:br]
       "Users are able to choose what characters they want to use." [:br]
       "The app is NOT intended to replace your password manager but as a backup solution if the integrated password generator in, for example, Firefox doesn't recognize the password field or you need to generate a password for an app where you can't use your password manager."]
      [:p "Get the source code on "
       [:a {:class "external"
            :href "https://github.com/UnicornyRainbow/Secrets"
            :target "_blank"}
        "Github"] "."]
      [:hr]
      [:a {:class "external"
           :href "https://www.flaticon.com/free-icons/smart-key"
           :target "_blank"}
       "Smart key icons created by Freepik - Flaticon"]]]
    [:h2 "Installation"]
    [:a {:class "no-hover-color"
         :href "https://flathub.org/apps/io.github.unicornyrainbow.secrets"
         :target "_blank"}
     [:img {:width "240"
            :alt "Download on Flathub"
            :src "https://flathub.org/api/badge?locale=en"}]]
    [:details
     [:summary "Dependencies"]
     (components/flatpak-setup-instructions)]
    [:details
     [:summary "Installation"]
     [:h3 "Graphical"]
     [:p "After you have added Flathub, you should be able to go to your graphical \"App Store\" (i.e. Gnome Software) and search for \"Key Cutter\", it should be the app with a yellow/red key icon."]
     [:p "If you don't find it, it may be possible that you first need to set Flatpak as a source, look for it in the settings of your Graphical Package Manager." [:br]
      "You should also find plenty tutorials on the Internet."]
     [:h3 "Command Line"]
     [:p "Install it with "
      [:code "flatpak install io.github.unicornyrainbow.secrets"]]
     [:p "If you encounter problems, please refer to "
      [:a {:class "external"
           :href "https://flathub.org/apps/details/io.github.unicornyrainbow.secrets"
           :target "_blank"}
       "the official flathub"]
      " page."]]]))

(defn organizer []
  (components/body
   "Organizer"
   "Coding"
   "https://unicornyrainbow.org/Coding/Organizer"
   "UnicornyRainbow - Organizer"
   "Organizer - A Simple Kanban Board"
   [:div
    [:div {:class "grid auto-fit"}
     [:img {:src "/img/coding/organizer/app_dark_expanded.png"
            :style "width: 100%;"
            :alt "The application window using GTK and Libadwaita UI components ind dark mode. The window shows a Kanban board with different columns and tasks on the left and a detail window of a task on the right side."}]
     [:div
      [:p "Organize your work in a local and agile Kanban board, written with Python, Gtk 4 and Libadwaita."]
      [:p "Get the source code on "
       [:a {:class "external"
            :href "https://github.com/UnicornyRainbow/Organizer"
            :target "_blank"}
        "GitHub"]
       "."]]]
    [:h2 "Installation"]
    [:p "This app is still under heavy development and there is no supported way of installing it"]]))
