# App

A simple Android application that demonstrates basic UI interaction.

## Description

This is a basic Android app that shows a button which, when clicked, displays a "Hello Marcos!" message on the screen. It's built with Kotlin and uses modern Android development practices.

## Features

- Clean, minimal UI with ConstraintLayout
- Button click interaction
- Dynamic text display
- Edge-to-edge layout support


## Getting Started

### Prerequisites

- Android Studio Ladybug (2024.1.1) or later
- Kotlin 1.9.0 or later
- Android SDK API level 36 (Android 15)
- Minimum SDK API level 24 (Android 7.0)

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/marcosvinirocha/app.git
   ```

2. Open the project in Android Studio

3. Build the project:
   ```
   ./gradlew build
   ```

4. Run the app:
   ```
   ./gradlew installDebug
   ```

### Building from Command Line

To build a debug APK:
```bash
./gradlew assembleDebug
```

To build a release APK:
```bash
./gradlew assembleRelease
```

## Project Structure

```
app/
├── src/main/
│   ├── java/com/marcosudia/app/
│   │   └── MainActivity.kt     # Main activity with button click logic
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml  # Main layout file
│   │   ├── values/
│   │   │   └── strings.xml        # String resources
│   │   └── ...                    # Other resources
│   └── AndroidManifest.xml        # App manifest
└── build.gradle.kts               # Module-level build configuration
```

## Dependencies

- AndroidX Core KTX
- AndroidX AppCompat
- Material Components
- AndroidX ConstraintLayout
- AndroidX Activity

## How It Works

The app consists of a single screen with:
1. A button that initially says "Show"
2. A hidden text view that becomes visible when the button is clicked
3. When clicked, the text view displays "Hello Marcos!"

The UI is built with ConstraintLayout for responsive design across different screen sizes.

## Development

### Code Overview

The main logic is in `MainActivity.kt`:
- Uses `enableEdgeToEdge()` for modern edge-to-edge display
- Implements `ViewCompat.setOnApplyWindowInsetsListener` for proper window insets handling
- Sets an onClickListener for the button to show and update the text view

### Resources

- Layout: `res/layout/activity_main.xml`
- Strings: `res/values/strings.xml`
- Colors: Default Material colors

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a pull request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

Your Name - [@your_twitter](https://twitter.com/your_twitter) - email@example.com

Project Link: [https://github.com/your-username/app](https://github.com/your-username/app)
