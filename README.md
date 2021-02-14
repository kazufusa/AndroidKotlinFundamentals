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

### 5.3. Data binding with ViewModel and LiveData

https://developer.android.com/codelabs/kotlin-android-training-live-data-data-binding

### 5.4. LiveData transformations

https://developer.android.com/codelabs/kotlin-android-training-live-data-transformations#10

## Lisson 6: Room database and coroutines

The application directory is [./TrackMySleepQuality-Starter](./TrackMySleepQuality-Starter).

### 6.1. Create a Room Database

https://developer.android.com/codelabs/kotlin-android-training-room-database

### 6.2. Coroutines and Room

https://developer.android.com/codelabs/kotlin-android-training-coroutines-and-room

### 6.3. Use LiveData to control button states

https://developer.android.com/codelabs/kotlin-android-training-quality-and-states

## Lesson 7: RecyclerView

The application directory is [./TrackMySleepQuality-Starter](./TrackMySleepQuality-Starter).

### 7.1. RecyclerView fundamentals

https://developer.android.com/codelabs/kotlin-android-training-recyclerview-fundamentals

> To display your data in a RecyclerView, you need the following parts:
> 
> - Data to display.
> - A RecyclerView instance defined in your layout file, to act as the container for the views.
> - A layout for one item of data. If all the list items look the same, you can use the same layout for all of them, but that is not mandatory. The item layout has to be created separately from the fragment's layout, so that one item view at a time can be created and filled with data.
> - A layout manager. The layout manager handles the organization (the layout) of UI components in a view.
> - A view holder. The view holder extends the ViewHolder class. It contains the view information for displaying one item from the item's layout. View holders also add information that RecyclerView uses to efficiently move views around the screen.
> - An adapter. The adapter connects your data to the RecyclerView. It adapts the data so that it can be displayed in a ViewHolder. A RecyclerView uses the adapter to figure out how to display the data on the screen.

### 7.2. DiffUtil and data binding with RecyclerView

https://developer.android.com/codelabs/kotlin-android-training-diffutil-databinding/#0

> What you'll learn
> 1. How to use DiffUtil, a utility that calculates the difference between two lists to efficiently update a list displayed by RecyclerView.
> 1. How to use data binding with RecyclerView.
> 1. How to use binding adapters to transform data.

### 7.3. GridLayout with RecyclerView

https://developer.android.com/codelabs/kotlin-android-training-grid-layout

### 7.4. Interactive with RecyclerView items

The application directory is [./RecyclerViewClickHandler-Starter](./RecyclerViewClickHandler-Starter).

https://developer.android.com/codelabs/kotlin-android-training-interacting-with-items

### 7.5. Headers of RecyclerView

https://developer.android.com/codelabs/kotlin-android-training-headers/

The application directory is [./RecyclerViewClickHandler-Starter](./RecyclerViewClickHandler-Starter).
