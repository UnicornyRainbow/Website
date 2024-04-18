+++
template = "base.html"
permalink = "https://unicornyrainbow.org/Coding/KeyCutter"
description = "KeyCutter - Easily generate passwords"
title = "KeyCutter"
extra = {"header_title"="UnicornyRainbow - KeyCutter", "current"="Coding"}
+++

<div class="grid auto-fit">
<img src="/static/coding/key_cutter/app_dark.png" style="width: 100%;" alt="The application window using GTK and Libadwaita UI components ind dark mode. The window is small and vertical and shows the default view of the app with settings that can be set, a password output field and a generate button.">
<div>

A small app written in Python, Gtk4 and Libadwaita that can generate passwords.\
It uses <a class="external" href="https://docs.python.org/3/library/secrets.html" target="_blank">Pythons Secrets module</a> to generate the passwords, so they should be decently secure.\
Users are able to choose what characters they want to use.\
The app is NOT intended to replace your password manager but as a backup solution if the integrated password generator in, for example, Firefox doesn't recognize the password field or you need to generate a password for an app where you can't use your password manager.

Get the source code on <a class="external" href="https://github.com/UnicornyRainbow/KeyCutter" target="_blank">GitHub</a>.

***

<a class="external" href="https://www.flaticon.com/free-icons/smart-key" target="_blank">Smart key icons created by Freepik - Flaticon</a>

</div>
</div>

## Installation

<a class="no-hover-color" href="https://flathub.org/apps/io.github.unicornyrainbow.secrets" target="_blank">
    <img width='240' alt='Download on Flathub' src='https://flathub.org/api/badge?locale=en'/>
</a>

{% details(summary="Dependencies") %}

### Flatpak

The package manager / packaging format used:

- Fedora: `sudo dnf install flatpak`
- Ubuntu: `sudo apt install flatpak`
- Arch: `sudo pacman -S flatpak`

Then add Flathub: `flatpak remote-add --if-not-exists flathub https://flathub.org/repo/flathub.flatpakrepo`

Or follow the <a class="external" href="https://www.flatpak.org/setup/" target="_blank">official instructions</a>

{% end %}

{% details(summary="Installation") %}
### Graphical

After you have added Flathub, you should be able to go to your graphical "App Store" (i.e. Gnome Software) and search for "Key Cutter", it should be the app with a yellow/red key icon.

If you don't find it, it may be possible that you first need to set Flatpak as a source, look for it in the settings of your Graphical Package Manager.\
You should also find plenty tutorials on the Internet.

### Command Line

Install it with `flatpak install io.github.unicornyrainbow.secrets`

If you encounter problems, please refer to <a class="external" href="https://flathub.org/apps/details/io.github.unicornyrainbow.secrets" target="_blank">the official flathub</a> page.
{% end %}