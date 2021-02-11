# Android Kotlin Fundamentals

I'm going to start learning Android application development.

Here is tutorials: Android Kotlin Fundamentals in https://developer.android.com/courses

or https://developer.android.com/courses/kotlin-android-fundamentals/overview

## Lesson 1: Build your first app

### 1 Get started

https://developer.android.com/codelabs/kotlin-android-training-get-started/#2

The application directory is [./HelloWorld](./HelloWorld).

### 01.2 Anatomy of Basic Android Project

https://developer.android.com/codelabs/kotlin-android-training-app-anatomy

The application directory is [./DiceRoller](./DiceRoller).

### 01.3 Image resources and compatibility

https://developer.android.com/codelabs/kotlin-android-training-images-compat

The application directory is [./DiceRoller2](./DiceRoller2).

### 01.4 Learn to help yourself

https://developer.android.com/codelabs/kotlin-android-training-available-resources/

## Lesson 2: Layouts

### LinerLayout using the Layout Editor

https://developer.android.com/codelabs/kotlin-android-training-linear-layout/index.html

The application directory is [./AboutMe](./AboutMe).

### Add user interactivity

https://developer.android.com/codelabs/kotlin-android-training-interactivity/index.html#2

The application directory is [./AboutMeInteractive](./AboutMeInteractive).

### 02.3 ConstraintLayout using the Layout Editor

https://developer.android.com/codelabs/kotlin-android-training-constraint-layout/index.html

- [./ColorMyViews](./ColorMyViews).
- TODO: [coding charenge](https://developer.android.com/codelabs/kotlin-android-training-constraint-layout/index.html#8)

### 02.4: Data binding basics

https://developer.android.com/codelabs/kotlin-android-training-data-binding-basics/index.html#0

- [./AboutMeDataBinding](./AboutMeDataBinding).

## Lesson 3: Navigation

- [./AndroidTrivia-Starter](./AndroidTrivia-Starter).

### 03.1 Create a fragment

https://developer.android.com/codelabs/kotlin-android-training-create-and-add-fragment/index.html#0

### 03.2 Define navigation paths

https://developer.android.com/codelabs/kotlin-android-training-add-navigation/index.html

#### Questions

1. Add dependencies for navigation-fragment-kts and navigation-ui-ktx in the build.gradle(module) file.
2. In a file (often called navigation.xml) in the `res > navigation` folder
3. You can click the NavHostFragment in the Project view to open the navigation graph.
    - You add the `NavHostFragment` to the main layout by adding a `<fragment>` whose name is `androidx.navigation.fragment.NavHostFragment`
4. You create a potential path through the app from one Fragment to another by connecting the fragments in the navigation graph.
    - the `type` of a connection between fragments is `Action`
    - To open the navigation graph, you double-click the navigation file(`navigation.xml`) in the Android Studio Project pane, then click the **Design** tab.
5. In the project's navigation file, either by setting the `ID` attribute in the navigation graph or in the navigation XML file in the **res > navigation** folder.
6. In the `onClickListener` for the **Show headlines** button, call `navigate()` on the navigation controller, passing the action that connects the `NewsFragment` to the `HeadlinesFragment`.
7.  The destination of the `action_FragmentA_to_FragmentB` action specifies that when the user is at `FragmentA`, the net destination in the app is `FragmentB`.
    - The `popUpTo` attribute of the action can modify where the app navigates to if the user taps the system Back button.
8. For `action_FragmentA_to_FragmentB`, set popUpTo to none and `popUpToInclusive` to no value. (You can omit both attributes.)
    - For `action_FragmentB_to_FragmentC`, set popUpTo to `FragmentA` and popUpToInclusive to false.
9. If popUpToInclusive is true: Android navigates out of the app because there is nothing left in the back stack for this app.
    - if popUpToInclusive is false: The app goes back to the news home screen.
10. In a `menu_name.xml` file in the ** res > menu ** folder, add an `<item>` tag for each menu item. Create separate XML files for each separate menu.
11. Call `setHasOptionsMenu(true)` in onCreate() for an Activity, or in onCreateView for a Fragment.
    - implement onCrateOptionsMenu() in the Activity or Fragment to create the menu.
    - implement onOPtionsItemSelected in the Activity or Fragment to determine what happens when a user selects a menu item in the options menu.
12. Use `<DrawerLayout>` as the root view in the relevant layout file, and add a `<NavigationView>` tag to that layout.
    - In the `<NavigationView>` in the layout, set the `android:menu` attribute in the navigation drawer menu.
    - ~~In the `<NavigationView>` in the layout, set the `android:menu` attribute to the navigation drawer menu.~~ `android:menu` is wrong and `app:menu` is correct here.
13. B: `NavigationUI.setupWithNavController(navigationView, navigationController)`
14. Link the navigation controller to the app bar using `NavigationUI.setupActionBarWithNavController(context, navigationController)`
    - Override `onSuppoertNavigationUp()` method to call `navigationUp()` on the navigation contoller.

### 03.3 Start an external Activity


https://developer.android.com/codelabs/kotlin-android-training-start-external-activity/index.html

## Lesson 4: Activity and fragment lifecycles

### 4.1. Lifecycles and logging

https://developer.android.com/codelabs/kotlin-android-training-lifecycles-logging

The application directory is [./DessertClicker-Starter](./DessertClicker-Starter).

## Lesson 5: Architecture components

The application directory is [./GuessTheWord-Starter](./GuessTheWord-Starter).

### 5.1. ViewModel

https://developer.android.com/codelabs/kotlin-android-training-view-model

### 5.2. LiveData and LiveData observers

https://developer.android.com/codelabs/kotlin-android-training-live-data
