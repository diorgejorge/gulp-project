// Gulpfile
var gulp = require('gulp');
var convertEncoding = require('gulp-convert-encoding');
 
gulp.task('reencode', function () {
    return gulp.src('{folder}/*')
        .pipe(convertEncoding({to: 'iso-8859-15'}))
        .pipe(gulp.dest('dist'));
});
