# Create local app

Template to create a new Scala (sbt) project which is compatible with sbt launcher.

## Usage

```
$ sbt new lettenj61/create-local-app.g8
```


## Publishing

`publish` task will deliver artifacts under `${user.home}/.ivy2/create-local-app`. By default (as it is the default for sbt) it uses Maven pattern resolution of directories.

If you prefer to use Ivy instead of Maven, set `publishMavenStyle := false` in generated `build.sbt`.


## Launcher application

This template generates default launcher configuration file for sbt launcher. See `example.launchconfig`.

To launch the application:

```
$ launch @example.launchconfig
```

For reference, you should modify `repositories` configuration when using it in Ivy style repository:

```
[repositories]
  local-app: file:/${user.home}/.ivy2/create-local-app, [organisation]/[module]/(scala_[scalaVersion]/)(sbt_[sbtVersion]/)([branch]/)[revision]/[type]s/[artifact](-[classifier]).[ext]
```

