# SPARQL Playground

*Note: This is an adaptation of the <a target="_blank" href="https://github.com/calipho-sib/sparql-playground">sparql-playground</a> which was created
in the course of my <a target="_blank" href="https://github.com/raffaelfoidl/ProvCaptPyEnvs">bachelor thesis</a> in Software & Information Engineering Vienna University of Technology.
For information on the changes made to the original version, refer to the corresponding about page or provcapt/pages/99_Modifications for ProvCaptPyEnvs.md.*

SPARQL Playground is a standalone multi-platform web application used to learn SPARQL (implemented in Java Spring Boot and AngularJS). 

It uses Sesame 2.8.6 as SPARQL Engine. 

It is being developed at the <a target="_blank" href="https://www.isb-sib.ch/">SIB Swiss Institute of Bioinformatics</a>.  

See the <a href="assets/poster-sparql.png" target="_blank"> poster</a> to have a quick overview of the tool.

Or see a live demo directly here: <a target="_blank" href="http://sparql-playground.isb-sib.ch/">http://sparql-playground.isb-sib.ch/</a>

You can also see a live version of nextprot samples here: <a target="_blank" href="http://sparql-playground.nextprot.org/">http://sparql-playground.nextprot.org/</a>


## Installation
* Download the [latest release](https://github.com/raffaelfoidl/sparql-playground/tarball/master)
* Unzip the folder and run the start script (`start.sh` for unix users `start.bat` for windows users) (it requires java 1.8 or higher)
* Once the application started you should open your browser on: <a href="http://localhost:8888" target="_blank">http://localhost:8888</a>
* Select the examples and click on the Go button

*Remark: Owing to the changes that were made compared to the initial version that has been forked, this screenshot is slightly outdated.
Nevertheless, it still gives a fairly accurate overview of the application.* 
<a href="assets/screenshot.png" target="_blank"><img width="90%" src="assets/screenshot.png"/></a>

## Predefined RDF scenarios / datasets

There is a scenario predefined which can be launched using the `start.sh` (Linux, Mac) or `start.bat` (Windows) script.
It comes with some example source files with numerous RDF triples such that the queries included can be tried out immediately.

## Slides of the SPARQL course at SIB Lausanne, 8th of November 2016

* <a href="assets/lausanne2016-sparql-introduction.pdf" target="_blank">Introduction to RDF and SPARQL</a>
* <a href="assets/lausanne2016-sparql-nextprot.pdf" target="_blank">RDF and SPARQL within neXtProt</a>
* <a href="assets/uniprot-and-federated-queries.pdf" target="_blank">UniProt data model and federated queries</a>

## Other presentations

* <a href="https://github.com/raffaelfoidl/sparql-playground/tree/provcapt/assets/archives" target="_blank">Additional Slides on GitHub</a>

## Create your own RDF scenario (no programming skills are required) 

* You can create your own scenario by giving a directory as argument: `java -jar sparql-playgroud.war your-directory-name`


Your directory should exhibit the following subfolders>:

* `ttl-data`: a folder containing turtle file(s)
* `queries`: a folder containing the example queries showed in the first page 
* `prefixes.ttl`: a file containing the default prefixes to be added to queries
* `pages`: pages with markdown files for the About tab

**Notes:**

* If your dataset is reasonably large so that it can't be fit in memory (> 50'000 triples) you may want to add the property `-Drepository.type=native`. This will create a native repository (instead of a in memory datastore). The database will be persisted in a `sesame-db` folder. The first time it will take some time to create the structure, but once the application is restarted it will be instantaneous. 

* For development purposes you may want to set the java property `-Dspring.profiles.active=nocache` so the cache is not enabled (example queries, page, images, faqs ...) 

## Technology in use
* The SPARQL engine is Sesame 2.8.6
* The backend uses Spring Boot 1.2.3
* The frontend is built with angularJS 1.3 and bootstrap 3
* Requires Java 1.8 or higher

# License

The project is open source and free under the GNU GPL v2 License. The sources are available on <a target="_blank" href="https://github.com/raffaelfoidl/sparql-playground">GitHub</a>.

This project was forked from <a target="_blank" href="https://github.com/calipho-sib/sparql-playground">sparql-playground</a>, which
 in turn is a fork of the <a target="_blank" href="http://snorql.nextprot.org/">neXtProt snorql interface.</a>
