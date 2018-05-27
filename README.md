# php-llk-parser
ANTLR-based parser for PHP language (version 5.2)

The project is moved from googlecode (see it in [archive](https://code.google.com/archive/p/php-llk-parser-core/))

Developed in 2012 as a 'just for fun', the project represents a stable implementation of PHP 5.2 grammar developed on the top of ANTLR v2. The parser provides the abstract syntactic tree (AST) as the result of its work. Such data structure is commonly used in the syntactical analysis tasks. The given grammar doesn't use backtracking so the complexity level is guaranteed. It is developed from the scratch by means of php manuals learning, reverse engineering of the official php compiler and experiments.

# Purposes
1. Syntactical analysis of PHP sources
2. PHP grammar documenting

# Current status
PHP 5.2 is supported fully.

# Testing material
Officially PHP doesn't have a published language specification. Hence in order to be sure the parser supports the official grammar it is checked on the open source projects that are proven to be syntactically correct.

## Projects used as the test material
The following codebase is used for the test purposes. 
These sources are interpreted correctly: 
1. phpBB3 3.10 
2. Zend Framework 
3. Yii Framework 1.1.10 
4. Kohana 3.2 
5. phpMyAdmin 3.4.10 
6. MediaWiki 1.18.1

# Instructions
It is possible to easily see the parser working. The parser library has a console interface which is currently used for test purposes but it can be used just to check whether it works and see the ASTs constructed for different syntactical constructions.

1. Install Apache ANT
2. Checkout the project sources (see 'Sources' section above)
3. Compile the project with ant: $ ant testjar
4. Launch the compiled standalone jar to see the options $ java -jar bin/jar/php-llk-parser.jar

# More info 
The experience I got while working on this project is described within a blogbost [here](https://habr.com/post/140179/) (it is in Russian only, sorry).
