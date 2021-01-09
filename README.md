# Reagent / ShadowCLJS Starter

A starter template for frontend only projects using Reagent and ShadowCLJS.

Install dependencies with:

```
yarn install
```

To run dev server with hot reloading:

```
yarn dev
```

Release version:

```
yarn release
```

This package includes

- [shadow-cljs](https://github.com/thheller/shadow-cljs) - ClojureScript compilation tool.
- [reagent](https://github.com/reagent-project/reagent) - A ClojureScript interface to React.
- [Skeleton](http://getskeleton.com/) - Super simple CSS starter styles.


Install in roam paste the following into `{{[[roam/js]]}}` block

```javascript       
(() => {
  const installScript = (src, onError) => {
    var existing = document.getElementById(name);
    if (existing) { existing.remove(); }
    var extension = document.createElement("script");
    extension.type = "text/javascript";
    extension.src = src; 
    extension.async = true;
    extension.id = name;
    extension.onerror = onError;
    document.getElementsByTagName("head")[0].appendChild(extension);
  };
  installScript('https://localhost:3739/js/main.js', (err) => {
    console.log('dev server not running, loading release build');
    // load release
    installScript('https://cdn.jsdelivr.net/npm/@kurtharriger/roam-ext-shadow-cljs/public/js/main.js')
  })
})()
```


