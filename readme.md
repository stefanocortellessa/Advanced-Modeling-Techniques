## Folders Organization
 
- HighOrder (HOT transformation, **Acceleo** Code)
- Use Cases (**ATL** Projects)
  - **compare2uFamily*
    - Metamodels
    - Models 
      - Case1
      - Case2
      - ...
      - CaseN
    - Transformation
  - **compare2uUniversity**
    - Metamodels
    - Models 
    - Transformation
   
## Run Configurations

Taking into account the **two _Use Cases_**, to run them is necessary to know how to run the transformations:
- **ATL code** is in *'Transformation'* folder (e.g. compare2Ufamily.atl)
- **Metamodels** are in *'Metamodels'* folder (e.g. Compare.ecore and UFamily.ecore)
- **Source Models** are located in the *'Models'* folder, in the sub-folder *'Case n'*. For each sub-folder there is a compare.xmi model that represent the source model for that case
- **Target Model** is in the *'Transformation'* folder (e.g. out.xmi)


Taking into account the **_HOT_ Transformation**, to run it is necessary to know how to run the code:

- **Project** : HighOrder
- **Main Class** : HighOrder.main.Generate
- **Model** is in the *'Metamodel'* folder (e.g. Family2.ecore)
- **Target** is in the *'out'* folder
