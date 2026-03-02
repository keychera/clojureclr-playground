# clj clr

```sh
# 1. download dotnet from official web

# 2.
dotnet tool install -g Clojure.Main
# error => No NuGet sources are defined or enabled

# 3. https://stackoverflow.com/a/73961223/8812880
dotnet nuget add source "https://api.nuget.org/v3/index.json" --name "nuget.org"

# 4.
dotnet tool install -g Clojure.Main
# You can invoke the tool using the following command: Clojure.Main
# Tool 'clojure.main' (version '1.12.2') was successfully installed.

# 5.
Clojure.Main
# You must install or update .NET to run this application.
# ...
# The following frameworks were found:
#   8.0.8 at [C:\Program Files\dotnet\shared\Microsoft.NETCore.App]
#   10.0.3 at [C:\Program Files\dotnet\shared\Microsoft.NETCore.App]
# ... 
# To install missing framework, download:
# https://aka.ms/dotnet-core-applaunch?framework=Microsoft.NETCore.App&framework_version=9.0.0&arch=x64&rid=win-x64&os=win10

# 6.  download above, install

# 7.
Clojure.Main
# Clojure core loaded in 7199 milliseconds.
# Clojure 1.12.2
# user=>


```