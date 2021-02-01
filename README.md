
# About Project Barghos
Project Barghos is a set of multiple smaller libraries providing utilities and structures covering diverse general-use aswell as scientific applications.
Its goal is to heavily reduce boilerplate code, provide a common api that is used across all barghos subprojects and is easily extendable and also provide
easier and more intuitive ways to work with familiar structures like mathematical vectors to write cleaner code and still maintain a good performance.

The project originally started as "utilslib" and is till today maintained along the development of the CodeRed Game Engine.
Therefore the biggest part of the libraries are focused on common problems you could run into while developing a game engine.
But there are plans to extend the libraries with physics, financial calculations and AI and deep learning.

# Project Barghos Core Library
This part of Project Barghos contains a lot of basic structures and the entire basic api used across all barghos subprojects.
It is therefore required by every barghos subproject.

---

# Versioning

To not getting confused (especially myself) about the versioning, I define below what the different parts of the versions are and when to increment a part.
As always, if a version part needs to be increased all parts behind that part need to be resetted to 0.
If complex changes were made that would affect multiple version parts, the front most part that would fit a part of the change has to be increased.

\<MAJOR>.\<API>.\<MINOR>.\<PATCH>

Example: v1.23.2.101

**MAJOR**
The major version needs to be incremented in the following cases:

- Big redesigns of existing content, that change its api or its behavior.
- Removing entire content.

**API**
The api version needs to be incremented in the following cases:

- Changing the existing api, like changing function or class names or removing them entirely.
- Reorganizing packages or just moving files in the package hirachy.

**MINOR**
The minor version needs to be increased by one in the following cases:

- Adding new content without changing the api or redesigning existing content.
- Changing existing content without changing the api or the behavior.
- Removing existing private content.

**PATCH**

The patch version is showing the number of small bug fixes and documentation changes since the last minor update.
The patch version needs to be increased by one in the following cases:

- Documentation changes (added/changed/removed).
- Small bug fixes that are not api breaking.
