import reflex as rx

backdrop = "dimgray"
border_radius = "10px"
padding = "10px"
nav_height = 50
transition_nav = "all 0.3s ease 0.1s"
bg1 = "#ebd5c7"  # beige
bg2 = "#342f2d"  # brown
fg1 = "#646a54"  # green
fg2 = "olivedrab"  # bright green

body_element = dict(
    border_radius=border_radius,
    bg=bg1,
    margin=padding,
    padding=padding,
    box_shadow="10px 10px 5px lightgrey"
)

nav = body_element | dict(
    height=f"{nav_height}px",
    padding="0px"
)

nav_pic = dict(
    border_radius=border_radius,
    width=f"{nav_height}px",
    height=f"{nav_height}px",
    transition=transition_nav,
    margin_right=padding,
)

nav_pic_hover = dict(
    border_radius=f"{border_radius} 0px 0px {border_radius}",
    transition=transition_nav,
)

nav_button = dict(
    height=f"{nav_height}px",
    text_transform="uppercase",
    bg=bg1,
    border_radius="0px",
    color="black",
    transition=transition_nav,
)

nav_button_submenu = nav_button | dict(
    height=f"{nav_height * 0.8}px",
    margin_top=f"{nav_height * 0.2}px",
    text_transform="lowercase",
)

nav_button_hover = dict(
    bg=fg1,
    color="white",
    transition=transition_nav,
)
