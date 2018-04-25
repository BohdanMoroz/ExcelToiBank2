var gulp 			= require('gulp'),
	browserSync 	= require('browser-sync'),
	sass 			= require('gulp-sass');

gulp.task('browser-sync', function(){
	browserSync({
		server: {
			baseDir: 'site'
		},
		notify: false
	})
});

gulp.task('sass', function() {
	return gulp.src(['site/sass/**/*.sass', 'site/sass**/*.scss'])
		.pipe(sass({outputStyle: 'expanded'})).on('error', sass.logError)
		.pipe(gulp.dest('site/css'))
})

gulp.task('watch', ['browser-sync', 'sass'], function(){
	gulp.watch('site/index.html', browserSync.reload);
	gulp.watch('site/css/*.css', browserSync.reload);
	gulp.watch(['site/sass/**/*.sass', 'site/sass**/*.scss'], ['sass']);
});

gulp.task('default', ['watch']);