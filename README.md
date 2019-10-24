# Hibernate validator example

This is a Maven project exemplifying the Hibernate validator for forms.

I decided to go with ol' Spring MVC (no Boot) with an ol' XML configuration (no Java config for now).

The validator uses custom validation rules:

### Validation rules

There is a simple form that asks for a username and a number (called limit).

* The username must be one among `David`, `Victoria`, `Juan` and `Paulina` (ignoring case).
* The limit must be between 50 and 500.

### Result

Once there is a valid input, a result page will print the entered username, the date and the sum of all even numbers between zero and the limit

### Internationalization i18n

I also included internationalization. It can be activated to switch between Spanish and English using the parameter `lang`. 

`?lang=en`

The default language is Spanish `ES`. 