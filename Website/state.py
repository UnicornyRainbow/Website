import reflex as rx


class State(rx.State):
    """The app state."""
    key_cutter_menu = False
    organizer_menu = False
    codey_menu = False

    def key_cutter_menu_open(self):
        self.key_cutter_menu = True

    def key_cutter_menu_close(self):
        self.key_cutter_menu = False

    def organizer_menu_open(self):
        self.organizer_menu = True

    def organizer_menu_close(self):
        self.organizer_menu = False

    def codey_menu_open(self):
        self.codey_menu = True

    def codey_menu_close(self):
        self.codey_menu = False

    pass
