"""Welcome to Reflex! This file outlines the steps to create a basic app."""
from rxconfig import config
from Website import style
from Website.state import State

import reflex as rx

docs_url = "https://reflex.dev/docs/getting-started/introduction"
filename = f"{config.app_name}/{config.app_name}.py"


def nav_button(name: str, submenu: str = "") -> rx.Component:
    return rx.link(
        rx.button(
            name,
            style=style.nav_button if not submenu else style.nav_button_submenu,
            _hover=style.nav_button_hover,
        ),
        href=f"/{name.replace(' ', '')}" if not submenu else f"{submenu.replace(' ', '')}/{name.replace(' ', '')}"
    )


def template(*body: rx.Component) -> rx.Component:
    return rx.center(
        rx.responsive_grid(
            rx.flex(
                rx.link(
                    rx.image(
                        src="/me.png",
                        style=style.nav_pic,
                        _hover=style.nav_pic_hover,
                    ),
                    href="/",
                ),
                rx.flex(
                    nav_button("Key Cutter"),
                    rx.cond(
                        State.key_cutter_menu,
                        rx.box(
                            nav_button("Install", "Key Cutter"),
                        ),
                        rx.box(),
                    ),
                    on_mouse_enter=State.key_cutter_menu_open,
                    on_mouse_leave=State.key_cutter_menu_close,
                ),
                rx.flex(
                    nav_button("Organizer"),
                    rx.cond(
                        State.organizer_menu,
                        rx.box(
                            nav_button("Install", "Organizer"),
                        ),
                        rx.box(),
                    ),
                    on_mouse_enter=State.organizer_menu_open,
                    on_mouse_leave=State.organizer_menu_close,
                ),
                rx.flex(
                    nav_button("Codey"),
                    rx.cond(
                        State.codey_menu,
                        rx.box(
                            nav_button("Install", "Codey"),
                        ),
                        rx.box(),
                    ),
                    on_mouse_enter=State.codey_menu_open,
                    on_mouse_leave=State.codey_menu_close,
                ),
                style=style.nav,
            ),
            *body,
            width="80%",
            columns=[1],
        ),
        width="100%",
    )


def index() -> rx.Component:
    return template(
        rx.center(
            "Main",
            style=style.body_element,
        ),
        rx.center(
            "Main2",
            style=style.body_element,
        ),
    )


def key_cutter() -> rx.Component:
    return template(
        rx.box(
            "Key Cutter",
            style=style.body_element,
        )
    )


def organizer() -> rx.Component:
    return template(
        rx.box(
            "Organizer",
            style=style.body_element,
        )
    )


def codey() -> rx.Component:
    return template(
        rx.box(
            "Codey",
            style=style.body_element,
        )
    )


# Add state and page to the app.
app = rx.App()
app.add_page(index, route="/")
app.add_page(key_cutter, route="/KeyCutter")
app.add_page(organizer, route="/Organizer")
app.add_page(codey, route="/Codey")
app.compile()
