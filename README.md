# CountriesWeek6

CountriesWeek6 is an Android Jetpack-Compose based app that fetches data from the REST Countries API
and displays information about different countries. It uses Flows to track app uptime and count
taps that display country details and back-taps the return to the country list.

## Week 6

### Assignment

- Restructures the API call to be behind a method that utilizes a flow { } block.  The call site collects the data and catches any exceptions.

- Creates and utilizes three StateFlows in a singleton object for: 1) country info list item taps, 2) tapping the back button from the details screen, and 3) an app uptime counter.

- The singleton object flow objects are properly exposed as StateFlow and are val.

- Row that shows the current tap count, back count and refresh button.

- Loading screen shows the app uptime.
