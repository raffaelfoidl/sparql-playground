# Modifications for ProvCaptPyEnvs 

An exact and thorough list of modifications (including information on which files were changed in what ways) can be
abstracted from the <a target="_blank" href="https://github.com/raffaelfoidl/sparql-playground/commits/master">commit history</a> on GitHub. However, the following list depicts a summary of the modifications: 

* adapted README to reflect this repository's purpose and its relation to the original repository it was forked from
* removed additional scenarios neXtProt and UniProt since they are not of relevance for the purpose of this repository in the context of the thesis
* replaced initially available queries by the ones mentioned in the thesis (and more!)
* replaced default data provided by exemplary provenance exports from YesWorkflow and noWorkflow
* replaced predefined namespace prefixed by those used in YesWorkflow and noWorkflow in their default configuration (such that by default, prefixes do not need to be configured manually)
* restructured navigation bar: removed "Data" (see below), moved poster to the right, removed "Documentation" due to redundancy in combination with "About" option, renamed "Explore" to "Exploring a Dataset" and inserted a "Queries" item (functionally equivalent to clicking the header banner)
* not all turtle files in `ttl-data` are loaded at startup anymore (which resulted in conglomerating all triples from these files);
instead, a list of turtle files available is displayed in a combobox and exactly one such data source at a time can be loaded into memory and subsequently queried
* "Go" button is only clickable if data loading has been finished
* added a "command"-section in queries that demonstrate how test data for each query may be generated, i. e. parameters that are at least required in order to produce an output file that is a viable input for the respective query