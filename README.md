<!-- TABLE OF CONTENTS -->

<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#uninstallation">Uninstallation</a></li>
      </ul>
    </li>
    <li><a href="#Desicions-and-Documentation">Decisions and Documentation</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->

## About The Project

This Project focuses on building a compiler, that will be compiling a subset (dialect) of the chosen input language and output in the chosen target language. The decisions made are described below. 

Please note that this is the latest state of the project. if you want to see the older version of the project, please switch to older version branch (if available).

<!-- BUILT WITH -->

#### built with

Java SE Development Kit 11.0.9

<!-- GETTING STARTED -->

## Getting Started

<!--  prerequisites --> 

### Prerequisites

- Java SE Development Kit 11.0.9 or higher
- ANTLR compiler compiler tool
- ByteDeco javacpppreset

<!-- INSTALLATION -->

### Installation

1. Clone the repo
   ```bash
   git clone https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E.git
   ```
2. Links

   >  [Lexer from scratch](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/tree/master/src/main/java/lexer)

   >  [Parser from scratch](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/tree/master/src/main/java/parser)

   >  [Parser using Antlr](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/tree/master/src/main/java/antlr)

   >  [Our Test Cases](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/tree/master/src/main/resources/go)

   >  [Our Golang Grammar](https://code.fbi.h-da.de/compilerconstruction/compcon2021/X-Raster-E/-/blob/master/src/main/resources/grammar/goSubset.g4)

### Uninstallation

<!-- DOCUMENTATION -->

## Decisions and Documentation
#### A brief description of all implementation decisions agreed on.

- **Implementation Language:** the team needs to choose a programming language to use inside their compiler.
	
	>[JAVA](https://www.java.com/en/)
	
- **Compiler Compiler Tool Set:** the team needs to choose a compiler compiler tool set to use in Exercise 2 (and perhaps later).
	
	>[ANTLR](https://www.antlr.org/)
	
- **Target (Input) Language:** the team needs to choose a target language to accept as input.
	
	>[Golang](https://www.golang.org/)

- **Target Platform (Output):** the team needs to choose a target platform to generate as output.
	
	>[LLVM](https://www.llvm.org/)



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

