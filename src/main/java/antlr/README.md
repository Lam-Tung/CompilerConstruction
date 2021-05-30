#Antlr Parser

<!-- ABOUT THE PROJECT -->

## About The Project

This part of the project is a ANTLR based parser, we rewrote our Go-language grammar subset to fit the ANTLR Grammar syntax.
   >[Our Golang Grammar](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/blob/master/src/main/resources/grammar/goSubset.g4)

<!-- BUILT WITH -->

#### built with

Java SE Development Kit 11.0.9 or higher
Antlr Version 4.9.2
IntelliJ IDEA

<!-- GETTING STARTED -->

## Getting Started

<!--  prerequisites -->

### Prerequisites

- Java SE Development Kit 11.0.9 or higher
- ANTLR compiler compiler tool


<!-- INSTALLATION -->

### Installation

1. Clone the repo
   ```bash
   git clone https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E.git
   ```
### Parser Tree Inspecting Tutorial

#### Using IntelliJ ANTLR Plugin

1. Navigate to the grammar file goSubset.g4 and select the start rule, in this case sourceFile
![source file img](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/blob/master/img/sourcefile.PNG)
2. Right click and select "Test Rule sourceFile"
![test rule img](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/blob/master/img/test%20rule.PNG)
3. Enter the test case file in the input field or use existing file
![test case img](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/blob/master/img/antlr%20preview.PNG)
4. The Parse tree will be displayed on the right side
![parse tree img](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/blob/master/img/tree%20preview.PNG)

#### Using any IDE breakpoints

1. Add a break point at the end of the program
![breakpoint img](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/blob/master/img/break%20point.PNG)
2. Run in Debug mode
![debug img](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/blob/master/img/debug%20mode.PNG)
3. Inspect the tree
![tree img](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/blob/master/img/inspect.PNG)

#### No IDE ?

In case you want to start the project without using an IDE , compile the java file Antlr_Parser in the command line.
Please specify the Antlr jar dependency. E.g, if the Antlr jar is in the same directory, add the following to your command:
    ```bash
    -cp antlr-4.9.2-complete.jar
    ```
The java code will output a structured tree derived from the actual parsed tree using our custom visitor class 'myVisitor.java'
![tree console img](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/blob/master/img/tree%20console.PNG)

### Uninstallation

Just delete the files ...

#### Code Documentation Guide Lines

- The classes and methods are documented according to both IntelliJ and Google java style guides :

  >Links to [IntelliJ Java Code Style Guide](https://www.jetbrains.com/help/idea/code-style-java.html) and [Google Java Style Guide Lines](https://google.github.io/styleguide/javaguide.html).

<!-- LICENSE -->

## License

Distributed under the GNU General Public License 3 . See [`LICENSE`](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/blob/master/LICENSE) for more information.


<!-- CONTACT -->
## Contact

  - Mohamed Ibrahim Zgaya
  - Lam-Tung Truong



Project Link: [Compiler Construction 2021 Group-E](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E)

