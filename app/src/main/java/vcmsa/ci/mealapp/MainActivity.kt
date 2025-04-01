package vcmsa.ci.mealapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Title: Meal App MainActivity
        // Author: Developer
        // Date: 15 March 2025
        // Version: 1.0
        // Available:https://developer.android.com/reference/android/app/Activity
        // Additional References:https://developer.android.com/reference/android/widget/Button

        /// Get the UI element from the layout using their IDs
        //  TextView that will display all the suggested meals for the user
        val resultText: TextView = findViewById(R.id.resultText)

        // The EditText is for the user to input their time of day
        val timeOfDayInput: EditText = findViewById(R.id.timeOfDayInput)

        // Button that shows the information in the result text when clicked
        val loginButton: Button = findViewById(R.id.loginButton)

        // Button that resets everything from the user's inputs when clicked.
        val resetButton: Button = findViewById(R.id.resetButton)


        // Set an OnClickListener for the login button.Showing what it supposed to do.
        loginButton.setOnClickListener {
            // Access the Time Of The Day from the input field as a string.
            val timeOfDay = timeOfDayInput.text.toString() // W3school Changes the TextView to string


            // Title: Kotlin If ... Else
            // Author: w3schools
            // Date: 26 March 2025
            // Version: 1.0
            // Available: https://www.w3schools.com/kotlin/kotlin_conditions.php

            /// Use the If/Else statements to declare what the EditText is going to output to the TextView when the button is clicked.
            if(timeOfDay == "Morning" || timeOfDay == "morning") {
                resultText.text = """ 
                       IT'S BREAKFAST TIME !
                    
                    YOU CAN HAVE THE FOLLOWING MEALS:
                    PANCAKES AND SCRAMBLED EGGS.
                    SCRAMBLED EGGS WITH TOAST.
                    CEREAL OF YOUR CHOICE.
              """.trimIndent()

            } else if (timeOfDay == "Mid-morning" || timeOfDay == "mid-morning") {
                resultText.text = """
                            SNACK TIME !
                     
                     YOU CAN HAVE THE FOLLOWING MEALS:
                     FRUITS
                     MIXED NUTS
                     PEANUT BUTTER AND WHOLE WHEAT CRACKERS
               """.trimIndent()

            } else if (timeOfDay == "Afternoon" || timeOfDay == "afternoon") {
                resultText.text = """
                             LETS HAVE LUNCH !
                        
                         YOU CAN HAVE THE FOLLOWING MEALS:
                         SANDWICHES
                         SALAD BOWL
                         CHICKEN WRAP
              """.trimIndent()

            } else if (timeOfDay == "Afternoon Snack" || timeOfDay == "afternoon snack"){
                resultText.text = """
                            QUICK BITES !
                     
                     YOU CAN HAVE THE FOLLOWING MEALS:
                     CHEESE BALL BITES
                     MOZZARELLA-STUFFED PRETZEL BITES
                     PRETZELS
              """.trimIndent()

            } else if (timeOfDay == "Dinner" || timeOfDay == "dinner") {
                resultText.text = """
                          IT'S DINNER TIME !
                    
                    YOU CAN HAVE THE FOLLOWING MEALS:
                    PASTA
                    BEEF OR CHICKEN CURRY AND RICE
                    BIRYANI
              """.trimIndent()

            } else if (timeOfDay == "Desert" || timeOfDay == "desert") {
                resultText.text = """
                        AFTER DINNER SNACK !
                    
                    YOU CAN HAVE THE FOLLOWING MEALS:
                    MILK TART
                    ICE CREAM
                    CAKE
              """.trimIndent()

                // Title:How do I handle errors in Kotlin arrows
                // Author: pbuchheit
                // Date: 31 July 2024
                // Version: 1.0
                // Available:https://stackoverflow.com/questions/78817291/how-do-i-handle-logical-errors-in-kotlin-arrow

                // validation: check if the input is correctly filled
                // this is what the resultText is going to output when user has given the incorrect input.
            } else {
                resultText.text = "Invalid input. Please Enter Morning,Afternoon etc"

                // Title: How to reset EditText after an action has been completed?
                // Author: "Adil Sombrero" on Stack Overflow
                // Date: 12 November 2013
                // Version: 1.0
                // Available: https://stackoverflow.com/questions/7241808/how-to-reset-edittext-after-an-action-has-been-completed/7241832

                // Set an OnClickListener for the Reset Button
                resetButton.setOnClickListener {
                    // Reset the result text and the input text when the button is click
                    resultText.text = "Meal suggestions will appear here"
                    timeOfDayInput.text.clear()
                }

            }

        }
    }            }


