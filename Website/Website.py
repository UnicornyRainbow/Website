"""Welcome to Reflex! This file outlines the steps to create a basic app."""
from rxconfig import config
from Website import style
from Website.state import State

import reflex as rx

docs_url = "https://reflex.dev/docs/getting-started/introduction"
filename = f"{config.app_name}/{config.app_name}.py"

def nav_bar() -> rx.Component:
    return rx.flex(
        rx.avatar(
            size="md",
            src="me.png"
        ),
        rx.center("Nav Bar"),
        rx.spacer(),
        rx.button(
            rx.icon(tag="moon"),
            on_click=rx.toggle_color_mode,
        ),
        bg=style.bg1,
        width="100%",
    )

def index() -> rx.Component:
    return rx.vstack(
        nav_bar(),
        rx.box(
            "Body",
            bg="blue",
            width="80%",
            height="100%",
        )
    )


# Add state and page to the app.
app = rx.App()
app.add_page(index, route="/")
app.compile()
