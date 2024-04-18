+++
template = "base.html"
permalink = "https://unicornyrainbow.org/Coding/Codey"
description = "Codey - A simple application to preview and run code files for web development"
title = "Codey"
extra = {"header_title"="UnicornyRainbow - Codey", "current"="Coding"}
+++

<div class="grid auto-fit">
<img src="/static/coding/codey/app_dark.png" style="width: 100%;" alt="The application window using GTK and Libadwaita UI components ind dark mode. The window shows controls and a file selector on the left side and some source code on the right side.">
<div>

A simple application to preview and run code files, primarily intended for webdevelopment.\
Codey is written in python, using Gtk4 and Libadwaita and supports automatic light and dark mode.\
It also supports automatically starting and stopping the MariaDB database, but this feature prompts the user everytime the database is started or stopped for the root password.\
It is based on Python and uses the build in Php webserver.

Get the source code on <a class="external" href="https://github.com/UnicornyRainbow/Codey" target="_blank">GitHub</a>.

</div>
</div>

## Installation

{% details(summary="Dependencies") %}

### Flatpak

The package manager / packaging format used:

- Fedora: `sudo dnf install flatpak`
- Ubuntu: `sudo apt install flatpak`
- Arch: `sudo pacman -S flatpak`

Then add Flathub: `flatpak remote-add --if-not-exists flathub https://flathub.org/repo/flathub.flatpakrepo`

Or follow the <a class="external" href="https://www.flatpak.org/setup/" target="_blank">official instructions</a>

### php

PHP should already be installed, if not:

- Fedora: `sudo dnf install php`
- Ubuntu: `sudo apt install php`
- Arch: `sudo pacman -S php`

### MariaDB (optionally)

You only need MariaDB, if you want to use the MariaDB feature of Codey.

- Fedora: `sudo dnf install mariadb-server`
- Ubuntu: `sudo apt install mariadb-server`
- Arch: `sudo pacman -S mariadb`

{% end %}

{% details(summary="Installation") %}
### Graphical

Go to the <a class="external" href="https://github.com/UnicornyRainbow/Codey/releases/latest" target="_blank">latest release</a> and download the correct file for your cpu architecture (if you are not sure, give codey.flatpak a try).\
Then open the file in your file manager and double click it, it should open your graphical package manager /software store, then click on install.

### Command Line

Download it with

- `wget https://github.com/UnicornyRainbow/Codey/releases/latest/download/codey.flatpak` for x86
- `wget https://github.com/UnicornyRainbow/Codey/releases/latest/download/codey_aarch.flatpak` for aarch

then install it

- `sudo flatpak install codey.flatpak` or
- `sudo flatpak install codey_aarch.flatpak`
{% end %}