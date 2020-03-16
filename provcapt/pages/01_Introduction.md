# Introduction
This application is used as part of my <a target="_blank" href="https://github.com/raffaelfoidl/ProvCaptPyEnvs">bachelor thesis</a>
*Provenance Capturing for Python Environments* in Software & Information Engineering at University of Technology, Vienna.
It deals with two selected approaches of capturing provenance data for Python scripts,
<a target="_blank" href="https://github.com/raffaelfoidl/yw-prototypes">YesWorkflow</a> and 
<a target="_blank" href="https://github.com/raffaelfoidl/noworkflow/">noWorkflow</a>.

One important aspect of the thesis was to extend these tools such that they support exporting their
output in a W3C <a target="_blank" href="https://www.w3.org/TR/prov-o/">PROV-O</a> compliant format.
Achieving this makes leveraging their output much easier.

Since PROV-O can be mapped to RDF, the captured provenance can be serialized into one of the available formats, e. g. Turtle.
By querying this provenance data using SPARQL, one may gain even deeper insight into it.

That is what this SPARQL Playground is ideal for. It can be supplied with predefined queries and test data. Hence,
exemplary queries that have been constructed as part of the thesis as well as suitable test data are easily published
and can be tried out by the reader without much effort.